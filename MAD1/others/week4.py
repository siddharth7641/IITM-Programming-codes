class student:
    idnext = 0
    def __init__ (self, name, hostel):
        self.name =name
        self.id = student.idnext
        self.hosttel = hostel
        student.idnext = student.idnext +1