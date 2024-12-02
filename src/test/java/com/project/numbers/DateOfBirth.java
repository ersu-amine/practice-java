package com.project.numbers;

public class DateOfBirth {
    /*
Date of Birth only digits can be entered ("/" are inserted automatically). Req 1: Date in mm/dd/yyyy format.
Req 2: Age should be more than 18. Example: 01/01/2000. Your answer here:
1.2.3.4.5.
Answer:
Test Case 1: Valid Date Format
• Input: "01/01/2000"
• Expected Outcome: Date is valid and in mm/dd/yyyy format.
Test Case 2: Leading Zeros in Month and Day
• Input: "03/05/1995"
• Expected Outcome: Date is valid and in mm/dd/yyyy format.
Test Case 3: Single Digit Month and Day
• Input: "9/8/1980"
• Expected Outcome: Date is valid and automatically formatted to "09/08/1980".
Test Case 4: Invalid Date Format (Wrong Order)
• Input: "2000/01/01"
• Expected Outcome: Error message indicates the format should be mm/dd/yyyy.
Test Case 5: Invalid Date Format (Missing Year)
• Input: "05/30"
• Expected Outcome: Error message indicates the format should include a year.
Test Case 6: Invalid Date Format (Extra Characters)
• Input: "12/25/1999abc"
• Expected Outcome: Error message indicates only digits and "/" are allowed.
Test Case 7: Age Less Than 18
• Input: "06/15/2008"
• Expected Outcome: Error message indicates age must be more than 18 years.
Test Case 8: Today's Date (Edge Case)
• Input: Current date (e.g., "06/26/2024")
• Expected Outcome: Date is valid and meets age requirement if user is older than 18.
Test Case 9: Future Date (Edge Case)
• Input: "12/31/2050"
• Expected Outcome: Date is valid and meets age requirement if user is older than 18.
Test Case 10: Leap Year Date
• Input: "02/29/2000" (Leap year)
• Expected Outcome: Date is valid and in mm/dd/yyyy format.
Test Case 11: Non-Leap Year Date (Invalid Leap Year Date)
• Input: "02/29/2023" (Non-leap year)
• Expected Outcome: Error message indicates "Invalid date" or similar, as 2023 is not a
leap year.

     */
}
