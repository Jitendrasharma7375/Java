# Conditional Statement (if-else)
def check_even_odd(number):
    if number % 2 == 0:
        print(f"{number} is even.")
    else:
        print(f"{number} is odd.")

# Loop (for loop)
def print_numbers_up_to(limit):
    print("Numbers up to", limit, ":")
    for i in range(1, limit + 1):
        print(i, end=" ")
    print()  # Move to the next line after printing numbers

# Loop (while loop)
def countdown(start):
    print("Countdown from", start, "to 1:")
    while start > 0:
        print(start, end=" ")
        start -= 1
    print()  # Move to the next line after printing countdown

# Function calls to demonstrate the concepts
check_even_odd(7)

print_numbers_up_to(5)

countdown(3)
