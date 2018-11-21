#! /usr/bin/env python
import sys
import xml.etree.ElementTree as ET

doc = ET.parse(sys.stdin)

print 'digraph G {'

for p1 in doc.findall("./packages/package"):
    n1 = p1.get("name")
    for p2 in p1.getchildren():
        n2 = p2.get("name")
        if p2.get("type") == "usesInternal" and n1 != n2:
            print '  "%s" -> "%s";' % (n1, n2)

print '}'
