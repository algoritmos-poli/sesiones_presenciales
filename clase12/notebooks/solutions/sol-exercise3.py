# YOUR CODE HERE
def reverse_string(s):
    # Base case: an empty string or a one-character string is already reversed
    if len(s) <= 1:
        return s
    # Recursive case
    else:
        return reverse_string(s[1:]) + s[0]

# Verification
assert reverse_string("hola") == "aloh"
assert reverse_string("python") == "nohtyp"
assert reverse_string("a") == "a"
print("Exercise 2 completed successfully!")