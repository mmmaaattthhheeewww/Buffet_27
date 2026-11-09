year = input("enter a year")
year = int(year)
if year % 4 != 0:
    
    print(str(year) + "nay leapth year")
elif year % 100 == 0 and year % 400 != 0:
    print(str(year) + "nay leapth year")
else:
    print(str(year) + "yay leapth year")