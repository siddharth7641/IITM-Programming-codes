# # def find_indices_of_element(l, elem):
# #     '''Find all indices of an element in a list.

# #     Args:
# #         l (list): The input list.
# #         elem: The element to find.

# #     Returns:
# #         list: A list of indices where the element is found.

# #     Examples:
# #         >>> find_indices_of_element([1, 2, 3, 2, 4], 2)
# #         [1, 3]
# #         >>> find_indices_of_element(['a', 'b', 'a', 'c'], 'a')
# #         [0, 2]
# #     '''
# #     indices = []
# #     for i in range(len(l)):
# #         if l[i] == elem:
# #             indices.append(i)
# #     return indices

# # # Example usage
# # print(find_indices_of_element([1, 2, 3, 2, 4], 2))
# # print(find_indices_of_element(['a', 'b', 'a', 'c'], 'a'))



# def swap_adjacent_elements(t):
#     '''Swap every pair of adjacent elements in the tuple.

#     Args:
#         t (tuple): A tuple of even length.

#     Returns:
#         tuple: A new tuple with adjacent elements swapped.

#     Examples:
#         >>> swap_adjacent_elements((1, 2, 3, 4, 5, 6))
#         (2, 1, 4, 3, 6, 5)
#         >>> swap_adjacent_elements(('a', 'b', 'c', 'd'))
#         ('b', 'a', 'd', 'c')
#     '''
#     # Convert the tuple to a list to allow modifications
#     lst = list(t)
    
#     # Iterate through the list in steps of 2 to swap adjacent elements
#     for i in range(0, len(lst), 2):
#         print(i)
#         # if i + 1 < len(lst):
#         #     lst[i], lst[i + 1] = lst[i + 1], lst[i]
    
#     # Convert the list back to a tuple and return
#     return tuple(lst)

# # Example usage
# print(swap_adjacent_elements((1, 2, 3, 4, 5, 6)))
# print(swap_adjacent_elements(('a', 'b', 'c', 'd')))








