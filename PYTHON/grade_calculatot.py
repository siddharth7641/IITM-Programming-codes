def calculate_grade(gaa, f, qz1, qz2, bonus):
    """
    Calculate the total course score using the formula:
    T = 0.1GAA + max(0.6F + 0.2max(Qz1, Qz2), 0.4F + 0.2Qz1 + 0.3Qz2) + Bonus marks
    """
    # Calculate the first part: 0.6F + 0.2max(Qz1, Qz2)
    part1 = 0.6 * f + 0.2 * max(qz1, qz2)
    
    # Calculate the second part: 0.4F + 0.2Qz1 + 0.3Qz2
    part2 = 0.4 * f + 0.2 * qz1 + 0.3 * qz2
    
    # Take the maximum of the two parts
    max_part = max(part1, part2)
    
    # Calculate the total score
    total_score = 0.1 * gaa + max_part + bonus
    
    # Determine the letter grade and grade point based on total score
    if total_score >= 90:
        return total_score, "S", 10, "Pass"
    elif total_score >= 80:
        return total_score, "A", 9, "Pass"
    elif total_score >= 70:
        return total_score, "B", 8, "Pass"
    elif total_score >= 60:
        return total_score, "C", 7, "Pass"
    elif total_score >= 50:
        return total_score, "D", 6, "Pass"
    elif total_score >= 40:
        return total_score, "E", 4, "Pass"
    else:
        return total_score, "U", 0, "Fail"

def main():
    print("\n===== Course Grade Calculator =====")
    print("Formula: T = 0.1GAA + max(0.6F + 0.2max(Qz1, Qz2), 0.4F + 0.2Qz1 + 0.3Qz2) + Bonus marks")
    
    try:
        # Get user input for all components
        gaa = float(input("\nEnter GAA score: "))
        f = float(input("Enter F score: "))
        qz1 = float(input("Enter Quiz 1 score (Qz1): "))
        qz2 = float(input("Enter Quiz 2 score (Qz2): "))
        bonus = float(input("Enter Bonus marks: "))
        
        # Validate inputs (all scores except bonus should be between 0 and 100)
        for score, name in [(gaa, "GAA"), (f, "F"), (qz1, "Qz1"), (qz2, "Qz2")]:
            if not (0 <= score <= 100):
                print(f"Error: {name} score should be between 0 and 100")
                return
        
        # Calculate detailed breakdown for display
        gaa_component = 0.1 * gaa
        max_quiz = max(qz1, qz2)
        part1 = 0.6 * f + 0.2 * max_quiz
        part2 = 0.4 * f + 0.2 * qz1 + 0.3 * qz2
        max_part = max(part1, part2)
        
        # Get the final grade results
        total_score, letter_grade, grade_point, status = calculate_grade(gaa, f, qz1, qz2, bonus)
        
        # Display calculation breakdown
        print("\n------ Calculation Breakdown ------")
        print(f"GAA component (0.1 × {gaa}): {gaa_component:.2f}")
        print(f"Maximum quiz score: max({qz1}, {qz2}) = {max_quiz}")
        print(f"Part 1 (0.6F + 0.2max(Qz1, Qz2)): {part1:.2f}")
        print(f"Part 2 (0.4F + 0.2Qz1 + 0.3Qz2): {part2:.2f}")
        print(f"Maximum part used in formula: {max_part:.2f}")
        print(f"Bonus marks: {bonus}")
        print(f"Total score (T): {total_score:.2f}")
        
        # Display final results
        print("\n------------- Results -------------")
        print(f"Total Course Score (T): {total_score:.2f}")
        print(f"Letter Grade: {letter_grade}")
        print(f"Grade Point: {grade_point}")
        print(f"Status: {status}")
        
        
    except ValueError:
        print("Error: Please enter valid numerical values for all scores.")

if __name__ == "__main__":
    main()
