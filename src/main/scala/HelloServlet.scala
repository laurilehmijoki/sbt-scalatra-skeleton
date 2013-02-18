import org.scalatra._
import org.json4s.{DefaultFormats, Formats}
import org.scalatra.json._

class HelloServlet extends ScalatraServlet with JacksonJsonSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  get("/") {
    contentType = formats("json")
    Message("Hello", "World")
  }
}

private case class Message(greeting: String, to: String)
