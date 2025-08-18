# USING PYHTML

# import pyhtml as h
# t= h.html(
#     h.head(
#         h.title('test page')
#     ),
#     h.body(
#         h.h1('This is the title'),
#         h.div('this is div tag'),
#         h.div(h.h2('inside title'),
#               h.p('some text in paragraph.'))
#     )
# )
# print(t.render())


# USING STRING TEMPLATE

# from string import Template
# t= Template('$name is the $job of $company')
# s= t.substitute(name = 'Tim Cook', job ='CEO', company='Apple Inc.')
# print(s)


# USING JINJA2

# from jinja2 import Template
# t = Template("hello {{something}}")
# print(t.render(something = 'world'))
