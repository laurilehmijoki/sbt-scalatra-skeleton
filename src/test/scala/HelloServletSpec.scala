import org.scalatra.test.specs2.MutableScalatraSpec

class HelloServletSpec extends MutableScalatraSpec {
  addServlet(classOf[HelloServlet], "/*")

  "GET / on HelloServlet" should {
    "return a greeting" in {
      get("/") {
        body must equalTo("""{"greeting":"Hello","to":"World"}""")
      }
    }
  }
}
