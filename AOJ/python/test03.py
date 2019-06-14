lst = ['a','b','c','d']

try:
    n=lst.index('e')
    print(n,"番目にあります.")
except ValueError:
    print("要素が見つかりません")