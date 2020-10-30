def flip(d, a):
    if (d == 'R'):
        a.sort()
    else :
        a.sort(reverse=True)

    print(a)

def sample_tests():
    flip('R', [3, 2, 1, 2])
    flip('L', [1, 4, 5, 3, 5])