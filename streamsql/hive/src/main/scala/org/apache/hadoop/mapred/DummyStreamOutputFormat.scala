/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.mapred

import org.apache.hadoop.io.NullWritable
import org.apache.hadoop.fs.FileSystem
import org.apache.hadoop.util.Progressable

/**
 * Class for DummyStreamOutputFormat and DummyStreamRecordWriter, only for test.
 */
class DummyStreamOutputFormat extends StreamOutputFormat[NullWritable, NullWritable] {
  class DummyStreamRecordWriter extends StreamRecordWriter[NullWritable, NullWritable] {
    def write(key: NullWritable, value: NullWritable) {
    }

    def close(reporter: Reporter) {
    }
  }

  def getRecordWriter(ignored: FileSystem, job: JobConf, name: String, progress: Progressable)
    = new DummyStreamRecordWriter

  def checkOutputSpecs(ignored: FileSystem, job: JobConf) {
  }
}

