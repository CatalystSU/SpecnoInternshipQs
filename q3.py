import numpy as np
def solve():
    A = np.array([(0,2,1),(3,-1,2),(1,-1,1)])
    Ai = (np.linalg.inv(A))
    b = np.array([2,-3,-3])

    print(np.linalg.solve(A,b))
