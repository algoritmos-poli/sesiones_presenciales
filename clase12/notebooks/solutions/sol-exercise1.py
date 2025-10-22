def power(base, exponent):
    # YOUR CODE HERE
    # Base case: any number to the power of 0 is 1
    if exponent == 0:
        return 1
    # Recursive case
    else:
        return base * power(base, exponent - 1)

# Verification
assert power(2, 3) == 8
assert power(5, 2) == 25
assert power(10, 0) == 1
print("Exercise 1 completed successfully!")