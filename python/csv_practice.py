from _csv import writer

import csv

villains = [
    ['Doctor', 'No'],
    ['Rosa', 'Klebb'],
    ['Mister', 'Big'],
    ['Auric', 'Goldfinger'],
    ['Ernst', 'blofeld'],
]
with open('villains', 'rt') as fout:
    cin = csv.reader(fout)
    test = [row for row in cin]

print(test)
