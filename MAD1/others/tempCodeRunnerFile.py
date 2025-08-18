
from jinja2 import Template
t = Template("hello {{something}}")
print(t.render(something = 'world'))
