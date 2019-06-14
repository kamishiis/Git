import csv
vaillains = [
    {'first':'Doctor','last':'No'},
    {'first':'Rosa','last':'Klebb'},
    {'first':'Mister','last':'Big'},
    {'first':'Auric','last':'Goldfinger'},
]
with open('villains','wt') as fout:
    cout = csv.DictWriter(fout,['first','last'])
    cout.writeheader()
    cout.writerows(vaillains)