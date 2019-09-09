import os
from itertools import chain
import subprocess
from subprocess import DEVNULL

scalac = "/Users/arunkumar/scala/bin/scalac"


def find_all(basedir, pred):
    for root, dirs, files in os.walk(basedir):
        for fn in files:
            path = os.path.join(root, fn)
            if pred(path):
                yield path


files = chain(
    find_all("/Users/arunkumar/dotty/", lambda p: p.endswith('.scala')),
    find_all("/Users/arunkumar/scala2/", lambda p: p.endswith('.scala')))

added_files = chain(
    find_all("/Users/arunkumar/scalaAnalysis/scalaTrainingData/", lambda p: p.endswith('.scala')))

addedfiles = map(lambda x: os.path.basename(x), added_files)
# print(added_files)
#
if 'sammy_restrictions.scala' in addedfiles:
    print('yes')
else:
    print('No!!!')