import os
import time
for i in range(1, 3000):
    dir = i
    os.system(f'mkdir {dir}')
    time.sleep(1)
    os.system(f'python3 -u generate.py --temperature 1.0 --count 30 --predict_len {i} > {i}.txt')
    time.sleep(5)
    os.system(f'mkdir results/{i}')
    time.sleep(1)
    os.system(f'python3 postprocess.py --samples 3 --maxids 8 out.txt results/{i}/')
    time.sleep(5)

# python3 -u generate.py --temperature 1.0 --count 30 --predict_len 3000 >> out.txt
# python3 postprocess.py --samples 3 --maxids 8 out.txt results/