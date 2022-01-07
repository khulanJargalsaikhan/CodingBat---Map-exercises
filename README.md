# CodingBat---Map-exercises

*topping3*

    Given a map of food keys and topping values, modify and return the map as follows: 
    if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, 
    set that as the value for the key "spinach".

    topping3({"potato": "ketchup"}) 	            	-- {"potato": "ketchup", "fries": "ketchup"}
    topping3({"potato": "butter"}) 			-- {"potato": "butter", "fries": "butter"}
    topping3({"salad": "oil", "potato": "ketchup"}) 	-- {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
    
*allSwap*

    We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
	Loop over and then return the given array of non-empty strings as follows: 
	if a string matches an earlier string in the array, swap the 2 strings in the array. 
	When a position in the array has been swapped, it no longer matches anything. 
	Using a map, this can be solved making just one pass over the array. More difficult than it looks.

    allSwap(["ab", "ac"]) 					-> ["ac", "ab"]
    allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) -> ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
    allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) 	-> ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
