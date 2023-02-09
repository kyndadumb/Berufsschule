import pigpio
import time

pi = pigpio.pi()
pi.set_mode(18, pigpio.OUTPUT)
pi.set_mode(25, pigpio.OUTPUT)

while True:
    delay = 0.025
    pi.write(18, 1)
    time.sleep(delay)
    pi.write(18, 0)
    time.sleep(delay)
    pi.write(25, 1)
    time.sleep(delay)
    pi.write(25, 0)
    time.sleep(delay)

