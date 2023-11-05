### Based on the OWASP Top 10, these would be the security considerations for each aspect:

## Broken access control
The implementation of role-based access control (RBAC) is recommended to ensure that employees can only access data and services necessary for their role. For instance, customer support employees should not have the same level of access as software engineers.

## Cryptographic failures 
Sensitive data, including customer information, passwords, home addresses, and telephone numbers, should be encrypted both at rest and in transit. A service like AWS Key Management Service (KMS) could be used for managing cryptographic keys.

## Injection
It is crucial to ensure that the Python backend and Next.js frontend are not susceptible to SQL, NoSQL, OS, or JavaScript injection attacks. This can be achieved through the use of parameterized queries, careful code design, and appropriate security controls.

## Insecure design
The app and de website could not be designed to be secure from the start and have flaws or weaknesses that can be exploited. To prevent this, secure design principles such as defense in depth, least privilege, and security by default should be followed.

## Security misconfiguration
All systems should be regularly updated and patched to fix known vulnerabilities. The configurations for AWS and Kubernetes should follow best practices.

## Vulnerable and outdated components
All components, including programming languages, libraries, and software, should be regularly updated and patched.

## Identification and authentication failures
The implementation of multi-factor authentication for all users is recommended, especially for those who have full access to the system. Strong session management should be used and session IDs should not be exposed in the URL.

## Software and data integrity failures
If objects are being serialized, it is important to ensure that untrusted data is not being deserialized.

## Security logging and monitoring failures
The implementation of logging and monitoring is recommended to detect attacks and respond quickly. Services like AWS CloudWatch could be used for this purpose.

## Server-side request forgery (SSRF)
The app could receive false or malicious requests that make it access internal or external resources or services that it should not, and that can cause damage or data leaks. To prevent this, the requests received by the app should be validated and filtered, and white or blacklists for the resources or services that can be accessed should be used.