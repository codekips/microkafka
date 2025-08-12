# microkafka
A pub sub system like kafka for LLD understanding

## Core APIs
- Creating a topic. Any producer should be able to connect to a broker and request to create a topic, if it does not exist already. Must be idempotent.
- Add a message to an existing topic.  (For producers)
- Fetch messages from an existing topic. (For consumers)
- 
## Core Entity Design
- Broker (Top level entry, that has access to multiple topics. In a large system like Kafka, there can be multiple broker URLs that host different topics)
- Topic (Messages are sent to topics, and is the p.o.c for a producer/ consumer for specific kinds of messages )
- Message (An object with data, metadata fields)


