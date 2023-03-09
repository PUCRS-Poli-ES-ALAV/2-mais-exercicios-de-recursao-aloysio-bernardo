-- sum of elements in list
-- function signature
sumL :: [Int] -> Int 
-- base cases
sumL [] = 0
sumL (x:[]) = x 
-- recursion
sumL (x:y:xs) = x + y + sumL xs

