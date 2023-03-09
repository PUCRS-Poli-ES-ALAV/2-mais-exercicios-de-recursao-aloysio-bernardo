-- biggest number in list
-- function signature
biggest :: [Int] -> Maybe Int
-- error case
biggest [] = Nothing 
-- base case
biggest (x:[]) = Just x 
-- recursion
biggest (x:y:xs) | x >= y = biggest (x:xs)
                 | y > x  = biggest (y:xs)