import urllib.request as ur
url ='https://github.com/koki0702/introducing-python/blob/master/dummy_api/fortune_cookie_random1.txt'
conn = ur.urlopen(url)
print(conn)

data =conn.read()
print(data)
# print(conn.status)

print(conn.getheader(('Content-Type')))

for key,value in conn.getheaders():
    print(key,value)