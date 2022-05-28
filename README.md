# MemDB 
[![Build Status](https://travis-ci.com/scalahub/MemDB.svg?branch=master)](https://travis-ci.com/scalahub/MemDB)

In-Memory DB for apps without dedicated storage

This is a lightweight version of ScalaDB (https://github.com/scalahub/ScalaDB) with the following restrictions:

1. It only supports h2 in memory DB
2. It does not support aggregate operations

*Note:* If you want these operations, then use the full ScalaDB library 