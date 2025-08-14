# microkafka
A **pub-sub** system like kafka for LLD understanding

## Core APIs
- Creating a topic. Any producer should be able to connect to a broker and request to create a topic, if it does not exist already. Must be idempotent.
- Add a message to an existing topic.  (For producers)
- Fetch messages from an existing topic. (For consumers)

## Core Entity Design
- Broker (Top level service, that has access to multiple topics. 
In a large system like Kafka, there can be multiple broker URLs that host different topics)
For current model, given it is single broker, there is no representation for a broker, only topics and further.
Hence, the current service itself is treated as the bootstrap broker.
- Topic (Messages are sent to topics, and is the p.o.c for a producer/ consumer for specific kinds of messages )
- Consumer (Reads messages from topics. Commits an offset when it is done reading up to a certain offset)
- Message (An object with data, metadata fields)


### Learnings scratch pad.
- Keeping an offset in the Message entity itself is quite helpful.
- Could have gone with offset = arrayid, but that wouldn't scale, since Kafka 
also removes messages based on retention policy. So, that would have changed
offset, when a customer asks to give messages in a topic/ partition after a
certain offset id.
- This also means that there must be a mapping of offset to message, which a
topic can directly use.
In an in-memory topic, should it then be a offset id - global id? that is not
right though. Or, a linked-list implementation?
So a good iteration can be, start with a basic list with global index ids, then
move to a TreeMap kind of implementation which is in memory, as well as
navigable from a given offset.
- consumerOffsetTracking should not be done at topic level, rather at the
Consumer level.