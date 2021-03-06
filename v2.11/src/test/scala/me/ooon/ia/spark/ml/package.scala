/*
 * Copyright (c) 2018.
 * OOON.ME ALL RIGHTS RESERVED.
 * Licensed under the Mozilla Public License, version 2.0
 * Please visit http://ooon.me or mail to zhaihao@ooon.me
 */

package me.ooon.ia.spark
import me.ooon.base.io.CanDownloadFile

/**
  * package
  *
  * @author zhaihao
  * @version 1.0 2018-12-06 16:36
  */
package object ml {
  val dataServer = "http://h.ooon.me/"

  // 如果数据文件不存在，可以自动下载文件到 data 目录,需要保持 dataServer 的目录结构
  class MLDataFile(path: String) extends CanDownloadFile(path, ml.dataServer + path)

  object MLDataFile {
    def apply(path: String): MLDataFile = new MLDataFile(path)
  }
}
