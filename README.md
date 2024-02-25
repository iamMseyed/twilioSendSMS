# SMS Sender Spring Boot App using Twilio API Integration

This repository contains a simple Spring Boot application designed to facilitate SMS sending using the Twilio API. With seamless integration, users can send SMS messages to their registered contacts effortlessly.

**Note**  

- **Free Version:** Users can test sending SMS to their registered numbers during Twilio sign-in.
- **Paid Version:** Users have the flexibility to send SMS to any number, unrestricted by their registration details.
  
**Setup and api endpoint usage**

1. **Clone the repository:**
   git clone <repository_url>
   
2. **Twillio properties in application.properties file:**
  ```
  twilio.account_sid=your_account_sid 
  twilio.auth_token=your_auth_token
  twilio.phone_number=your_twilio_phone_number
```
3. **Endpoints**
```
    URL: localhost:8080/send-sms
      Method: POST  
        Request Body:
          {
              "to": "recipientPhoneNumber", //remember if you are using trail account of twillio, u can only send messages to the phone number which you registed with twillio
              "message": "message to sent"
          }
```
_In compliance with user privacy regulations, please note that Twilio's SMS functionality may be subject to additional terms and conditions. Refer to Twilio's documentation for more information_
