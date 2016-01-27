case class A()
case class B()
case class C()

def f1(a:A)=B()
def f2(b:B)=C()

//69
val composition= (f1 _) andThen (f2 _)

composition(A()) // Co tu się wypisze?

val f: (Int, Int) => Int = (a,b) => a+b


val fa: Int => (Int => Int) = a=>b=> a+b

fa(1)(2)