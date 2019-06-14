import requests

url ='https://github.com/koki0702/introducing-python/blob/master/dummy_api/fortune_cookie_random2.txt'

resp = requests.get(url)
resp
print(resp.text)
