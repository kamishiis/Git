def isEven(n):
    return (n%2==0)
def isOdd(n):
    return (n%2!=0)
lst =[1,2,3,4,5,6,7,8,9]
print('データリスト:',lst)
c = len(list(filter(isEven,lst)))
print('偶数である要素の個数:',c)