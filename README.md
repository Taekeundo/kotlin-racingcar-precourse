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
1. OutputView
   "Enter the names of the cars (comma-separated):"

2. InputView (CarNames <List>)
   e.g.) "jason, ja, j"

   -> Validate Input(1)
        Max length: 5 letters
        Duplication X
        Empty X

3. OutputView
   "How many rounds will be played?"

4. InputView (nMove <Int>)
   e.g.) 5

  -> Validate Input(2)
        Only Integer
        Must be over 0

5. OutputView
   "\n"

6. Service: generate & save
   1. Loop (Each round)
   2. generate Random number 
      If) Over 4 -> go
      Else) -> Not go
   3. Save each round result
      RoundResult <List>

   { carName: jason, position: 2 }
   { carName: ja, position: 1 }
   { carName: j, position: 3 }

7. Service: Calc
   Calculate winner -> Comparing final result.

   !! Handling Co-winner !!

8. OutputView
   Print loop for each round result as many as "nMove" times.

        Race Results
        jason : -
        ja : -
        j : -

9. OutputView
   "\n"

10. OutputView
   "Winners : jason"

11. Error handling
    - Invalid "carName"
    - Invalid "nMove"





## (3) Feature List based on the Execution Flow

### 1. Input & Output
- [ ] Show message: "Enter the names of the cars (comma-separated):"
- [ ] Receive car names and parse them
- [ ] Validate car names (length, duplicate, empty)

- [ ] Show message: "How many rounds will be played?"
- [ ] Receive number of rounds
- [ ] Validate number of rounds (integer, > 0)

### 2. Race Execution
- [ ] Run race for N rounds
- [ ] For each car, generate random number and decide move
- [ ] Save race result per round
- [ ] Print race result after each round

### 3. Result Calculation
- [ ] Calculate winners based on maximum moves
- [ ] Handle co-winners

### 4. Final Output
- [ ] Show winner(s)

### 5. Exception Handling
- [ ] Show error messages for invalid car names
- [ ] Show error messages for invalid number of rounds





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