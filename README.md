# Spring WebSocket

**WebSocket** is a full-duplex communications protocol layered over TCP. 
It is typically used for interactive communication between a user’s browser and a back-end server. 

Send message through websocket using spring messaging. Spring messaging using the following main annotaions and interfaces:
##### Main annotation:    
1. **@MessageMapping** is available with Spring Framework Messaging to register the method as a message listener.    
2. The **@DestinationVariable** annotation is used to capture the template variable topic from the destination.    
3. To send responses back to the client, the message controller method uses a **@SendTo** annotation specifying the client-side queue to which the response is to be sent.     
4. **@Payload** annotation that binds a method parameter to the payload of a message.  
5. **@MessageExceptionHandler** annotation for handling exceptions thrown from message-handling methods within a specific handler class.

##### Main interfaces:
1. Interface _Message_ - A generic message representation with headers and body
2. Interface _MessageConverter_ - a converter to turn the payload of a {@link Message} from serialized form to a typed Object and vice versa.
3. Interface _MessageSendingOperations_ - operations for sending messages to a destination.
4. Interface _MessageReceivingOperations_ - operations for receiving messages from a destination.
5. Interface _SimpMessageSendingOperations_ - a specialization of _MessageSendingOperations_ with methods for use with the Spring Framework support for Simple Messaging Protocols (like STOMP).