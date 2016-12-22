# Africa's Talking Java SDK



## Usage

```java

// Initialize SDK
AfricasTalking.initialize(USERNAME, API_KEY);

// Initialize a service e.g. SMS
SMSService sms = AfricasTalking.getService(AfricasTalking.SERVICE_SMS);

// Use the service
boolean sent = sms.send("Hello Message!", new String[] {"2547xxxxxx"});


```



## Download

Downloadable .jars can be found on the [GitHub download page][2].
You can also depend on the .jar through Maven:
```xml
<dependency>
  <groupId>com.africastalking</groupId>
  <artifactId>core</artifactId>
  <version>1.0.0</version>
</dependency>
```
or Gradle:
```groovy
// Get all services
compile 'com.africastalking:core:1.0.0'

// or get individual services
compile 'com.africastalking:account:1.0.0'
compile 'com.africastalking:payments:1.0.0'
compile 'com.africastalking:airtime:1.0.0'
compile 'com.africastalking:voice:1.0.0'
compile 'com.africastalking:sms:1.0.0'
compile 'com.africastalking:ussd:1.0.0'

```

## Services

All methods return a `String` of `xml` or `json` data based on the specified format. All methods are synchronous (i.e. will block current thread) but provide asynchronous variants that take a `Callback<String>` as the last argument.

### `AccountService`

- `getUser()`: Get user info.

### `AirtimeService`

- `send(String phone, float amount)`: Send airtime to a phone number.

- `send(HashMap<String,Float> recipients)`: Send airtime to a bunch of phone numbers. The keys in the `recipients` map are phone numbers while the values are aitrime amounts.

For more information about status notification, please read [http://docs.africastalking.com/airtime/callback](http://docs.africastalking.com/airtime/callback)

### `SMSService`

- `send(String message, String[] recipients)`: Send a message

- `sendBulk(String message, String[] recipients)`: Send a message in bulk
    
- `sendPremium(String message, String keyword, String linkId, String[] recipients)`: Send a premium SMS

- `fetchMessage()`: Fetch your messages
    
- `fetchSubscription(String shortCode, String keyword)`: Fetch your premium subscription data

- `createSubscription(String shortCode, String keyword, String phoneNumber)`: Create a premium subscription

For more information on: 

- How to receive SMS: [http://docs.africastalking.com/sms/callback](http://docs.africastalking.com/sms/callback)
- How to get notified of delivery reports: [http://docs.africastalking.com/sms/deliveryreports](http://docs.africastalking.com/sms/deliveryreports)
- How to listen for subscription notifications: [http://docs.africastalking.com/subscriptions/callback](http://docs.africastalking.com/subscriptions/callback)

### `USSDService`

For more information, please read [http://docs.africastalking.com/ussd](http://docs.africastalking.com/ussd)


### `VoiceService`

- `call()`

- `fetchQueuedCalls()`

- `ResponseBuilder`:

    - `say()`:
    - `play()`:
    - `getDigits()`:
    - `dial()`:
    - `conference()`:
    - `record()`:
    - `enqueue()`:
    - `dequeue()`:
    - `reject()`:
    - `redirect()`:
    - `build()`

### `PaymentService`

- `checkout()`

- `transfer()`

- `balance()`