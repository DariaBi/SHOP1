// @GENERATOR:play-routes-compiler
// @SOURCE:/home/daria/E-business/conf/routes
// @DATE:Mon Sep 24 01:52:00 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
