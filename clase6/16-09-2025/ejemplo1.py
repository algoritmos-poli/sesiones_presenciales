# -*- coding: utf-8 -*-
"""
Created on Tue Sep 16 12:39:40 2025

@author: Usuario
"""

# count
s = "Universidad de Antioquia, Alma Mater de la raza"
c1 = s.count('i')
c2 = s.count('er')
c3 = s.count('i',0,12)
# startswith
b1 = s.startswith('Uni')
# endswith
b2 = s.endswith('Uni')
# upper
s1 = s.upper()
# lower
s2 = s.lower()
# strip 
s3 = "        Este es un ensayo     ".strip()
# split
l1 = s.split() 
l2 = s.split(', ') 
# index
i1 = s.index('i') 
i2 = s.index('i',6) 
# replace
s_new = s.replace(", Alma Mater de la raza","")