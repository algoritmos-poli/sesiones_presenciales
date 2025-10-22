# YOUR CODE HERE
def count_element(a_list, element):
    # Base case
    if not a_list:
        return 0
    # Recursive case
    # Check if the first element is the one we are looking for
    if a_list[0] == element:
        return 1 + count_element(a_list[1:], element)
    else:
        return 0 + count_element(a_list[1:], element)

# Verification
my_list = [1, 2, 5, 2, 3, 2, 4]

# The print statements are now 'assert' statements
assert count_element(my_list, 2) == 3
assert count_element(my_list, 5) == 1

print("All tests passed successfully!")