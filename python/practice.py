import unicodedata


def unicode_test(value):
    import unicodedata
    name = unicodedata.name(value)
    value2 = unicodedata.lookup(name)
    print('value="%s",name="%s",value2 = "%s"' % (value,name,value2))

unicode_test('A')
unicode_test('$')
unicode_test('\u00a2')
unicode_test('\u20ac')

unicode_test('\u2603')
place = 'cafe'
place

snowman ='\u2603'
len(snowman)
ds = snowman.encode('utf-8')
len(ds)
ds
snowman.encode('ascii','xmlcharrefreplace')
place = 'caf\u00e9'
place
type(place)