# Project Plan & Checklist

## (0) Project Workflow
 1. Set-up the project
 2. Execution Flow
 3. Define `Feature List` based on Execution Flow
 4. Implement Features → Build the prototype
 5. Testing → Ensure normal and edge cases work correctly
 6. Refactoring → Improve structure after ensuring stability
 7. Finalization → Polish and clean up, then prepare for submission





## (1) Setup & Project Initialization
- [✅] : Clone repository (forked project)
- [✅] : Verify that project runs properly `./gradlew clean test`
- [✅] : Setup basic folder and package structure
- [✅] : Make the initial commit<br>
        `chore(project): initialize project with basic structure`





## (2) Execution Flow
1. Show main menu
2. Select an action
3. Input necessary data
4. Validate and process the data
5. Display results or error messages
6. Repeat or exit





## (3) Feature List based on the Execution Flow

### 1. Program Start & Main Menu
- [ ] : Display the main menu when the program starts.
- [ ] : Allow users to select core actions or exit the program.
        e.g., Search, Register, Exit

### 2. User Input
- [ ] : Accept user input for required actions.
- [ ] : Validate user input and handle invalid cases.
- [ ] : Transform user input into usable format if necessary.

### 3. Processing (Logic execution)
- [ ] : Save the validated and transformed data into storage.
- [ ] : Execture business logic as necessary.<br>
        `Calculation or Search`

### 4. Exception Handling
- [ ] : Handle invalid inputs and edge cases during processing.
- [ ] : Catch unexpected errors to prevent program crashes.
- [ ] : Prepare error messages when necessary.

### 5. Output
- [ ] : Display processed results to the user.
- [ ] : Display prepared error messages in case of fail or invalid actions.





## (4) Implement Features (Build the Prototype)

- [ ] : Implement ???
- [ ] : Implement ???
- [ ] : Implement ???
- [ ] : Implement ???
- [ ] : Implement ???
- [ ] : Implement ???
- [ ] : Ensure all flows are working.





## (5) Testing
### Goal
- Confirm stability and safety before starting refactoring

### [ Basic Testing ]
- [ ] : Test basic cases. (normal scenarios)
- [ ] : Test edge cases. (e.g., empty, invalid, special conditions)
- [ ] : Test invalid inputs -> ensure proper error handling.
- [ ] : Confirm that no critical errors occur during feature usage.
- [ ] : Create TDD file for core features.

### [ Automated Testing ]
- [ ] : Run `./gradlew clean test`
- [ ] : Perform final test on the website submission page.





## (6) Refactoring Plan

### [ Guidelines ]
- [ ] : Apply SRP
- [ ] : Improve readability
- [ ] : Remove duplicated logic
- [ ] : Clean code (limit depth)
- [ ] : Apply naming conventions (formatting)

### [ Domain ]
- [ ] : Make sure each entity has a clear and simple purpose.

### [ Service ]
- [ ] : Implement business logic (calc, search, etc.).

### [ Controller ]
- [ ] : Handle user input and request flow
- [ ] : Delegate logic to services

### [ View ]
- [ ] : InputView  - Handle user input
- [ ] : OutputView - Display results and errors





## (7) Finalization & Submission

### [ Review ]
- [ ] : Run `./gradlew clean test` <All tests pass>
- [ ] : Verify edge case handling and exceptional cases
- [ ] : Perform final test on the website submission page.
- [ ] : Update README
- [ ] : Create PR for submission