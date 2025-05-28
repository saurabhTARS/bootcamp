

num = 21

if num % 2 == 0 :
    print('Even')
else :
    print('Odd')


lower = 10
upper = 100

for num in range(lower, upper + 1) :
    if num > 1 :
        for i in range(2, num) :
            if num % i == 0 :
                break
        else :
            print(num)


factorial of a num : 3*2*1

num = 4

fact = 1

for i in range(2, num + 1) :
    fact *= i
print(fact)


fibonacci sequence : f(n) = f(n-1) + f(n-2)


n = 10

def f(n) : 
    if n == 1 :
        return 1
    if n == 0 :
        return 0
    return f(n-1) + f(n-2)
    
fib = [f(x) for x in range(n)]
print(fib)


list_arr = [x for x in range(100)]
print(list_arr)

result = 0

for num in list_arr :
    result += num
print(result)

list_arr = [3, 4, 1, 9, 2, 1]

larg = -1

for num in list_arr : 
    if num > larg :
        larg = num

print(larg)

list_arr = [3, 4, 1, 9, 2, 1]

k = 3

new_arr = list_arr[k:]
new_arr.extend(list_arr[:k])

print(new_arr)


words = "Sort Words in Alphabetical Order"

word_list = [word.capitalize() for word in words.split()]

word_list.sort()

print(word_list)


list1 = [1, 2, 3]
list2 = [1, 2, 3]
list3 = list1

print(list1 == list2)  # Output: True, because the values are equal
print(list1 is list2)  # Output: False, because they are different objects
print(list1 is list3)  # Output: True, because they refer to the same object


def fun(*args) :
    for arg in args :
        print(arg)

fun(1, 2, 3)

def fun(**kwargs) :
    # for key, value in kwargs.items() :
    #     print(key, value)
    print(kwargs)
    
    keys = [key for key in kwargs.keys()]
    print(keys)
    
    values = [kwargs[key] for key in kwargs.keys()]
    print(values)

fun(a=1, b=2, c=10)


def my_decorator(func) :
    def wrapper(*args, **kwargs) :
        print('Before the func call')
        result = func(*args, **kwargs)
        print('After the function call')
        return result
    return wrapper

@my_decorator
def sayHello() :
    print('Heelo World')


sayHello()


















