import Data.Maybe
-- convert a natural number to base 2
-- function signature
natDecToBin :: Int -> Maybe String
-- error case
natDecToBin x | x < 0 = Nothing
-- base cases
natDecToBin 0 = Just "0"
natDecToBin 1 = Just "1"
-- recursion
-- using fromJust is acceptable here since this call to natDecToBin will never
-- return a negative value
natDecToBin x = Just (fromJust (natDecToBin (x `quot` 2)) ++ show (x `mod` 2))
