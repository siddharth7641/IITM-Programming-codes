from jinja2 import Template

janapith_data =[
    {"year":1946,"awardees":"G. Gukesh", "language ": "Malayalum"},
    {"year":1947,"awardees":"B. Raman", "language ": "Telugu"},
    {"year":1948,"awardees":"D. Boman", "language ": "Kannada"}
]


def main():
    # Read the template file content into a variable
    template_file = open("janapith.html.jinja2")
    TEMPLATE = template_file.read()
    template_file.close()
    
    # Render the template using jinja2
    template = Template(TEMPLATE)
    content = template.render(janapith_data =janapith_data)

    # Save the rendered html document
    my_html_doc = open('janapith.html' , 'w')
    my_html_doc.write(content)
    my_html_doc.close()

if __name__ == "__main__":
    main()