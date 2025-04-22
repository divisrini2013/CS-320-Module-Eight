# CS-320-Module-Eight

# Reflection on Software Testing and Development Projects

I learned about software testing and development, with a focus on unit testing, test automation, and quality assurance, by implementing and analyzing code. This reflection describes how I ensured functionality and security in my code and interpreted.

# Ensuring Functionality and Security

I use extensive unit testing and validation to verify my code is functional and secure. Project One provided JUnit test cases for adding, updating, and deleting contacts in the Contacts module. These tests included edge and normal usage scenarios. I tested the system's rejection of incorrect phone number formats and null inputs. I tested for exceptions with assertions to ensure the code handled incorrect inputs safely.
This security was achieved through defensive coding. I built safeguards to prevent the system from acting unexpectedly by anticipating misuse or problems like null values or poorly formatted data. I also measured line and branch coverage with the JaCoCo code coverage tool to assess code testing. Over 90% line coverage and 85% branch coverage gave me confidence that most logical paths were tested. These strategies collectively contributed to ensuring the reliability and security of the software.

# Interpreting User Needs and Incorporating Them into the Program

Understanding and incorporating user needs is crucial to software development. In both projects, I used requirement documents and user stories to identify user-expected features. For instance, the Appointments module needed to prevent overlapping appointments. This requirement was directly translated into test cases that verified the system correctly identified and blocked conflicting time slots.
I linked functional requirements to unit tests using a traceability matrix. This ensured that every user need was coded and tested. I also implemented non-functional requirements like data validation and response handling. This structured approach helped me bridge user expectations and technical implementation. Thus, the software met requirements and was reliable and user-friendly.

# Approaching Software Design

Modularity, clarity, and maintainability guide my software design. I start by assessing requirements and dividing the system into logical parts. The Single task Principle simplifies debugging and increases code readability by assigning one task to each class or module. In the Contacts module, Contact.java handled data structure and ContactService.java handled data manipulation logic. Separating concerns improved testing and code organization.
I used TDD whenever possible during development. Before implementing the system, I built test cases to specify its behavior. This practice guided code design and ensured testability and verifiability of each feature. I used @BeforeEach setup methods in JUnit test classes to reduce code duplication and improve maintainability.
Future design methods include design patterns and architectural frameworks to improve scalability. I also plan to add continuous integration pipelines that run tests on every commit to improve software reliability.

# Conclusion

These project have provided me with great practical knowledge in software testing and development. By using meticulous requirement analysis, structured software design, and comprehensive testing, I produced functional, secure, and maintainable code. The initiatives allowed me to evaluate my development approach and identify areas for improvement. The Contact module source and test files from Project One and the Summary and Reflections Report from Project Two demonstrate my unit testing, validation, and quality assurance skills. This work will be a key part of my software development portfolio and learning.
