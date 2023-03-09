-- factorial of n (n!)
fac :: Int -> Maybe Int 
-- stop conditions
fac 0 = Just 1
fac 1 = Just 1 
-- recursion
fac n | n >= 0 = case fac (n - 1) of 
            Just m -> Just (n * m)
            Nothing -> Nothing
      -- error: n < 0
      | n < 0  = Nothing