Feature: Detection of a patient's pathology
  An automated self-diagnosis booth allows the patient to be informed of his or her pathology(s) using an index.
  Once this index has been interpreted, the patient will know which department to go to

  Scenario Outline: Heart problem detection
    Given the sensor provides a <healthIndex>
    When the machine interprets the index as multiple of 3
    Then the screen should display "Cardiologie"
    Examples:
      | healthIndex |
      | 3           |
      | 9           |
      | 66          |

  Scenario Outline: Fracture detection
    Given the sensor provides a <healthIndex>
    When the machine interprets the index as multiple of 5
    Then the screen should display "Traumatologie"
    Examples:
      | healthIndex |
      | 5           |
      | 55          |
      | 10          |

  Scenario Outline: Fracture and heart problem detection
    Given the sensor provides a <healthIndex>
    When the machine interprets the index as multiple of 3 and 5
    Then the screen should display "Cardiologie, Traumatologie"
    Examples:
      | healthIndex |
      | 15          |
      | 45          |
      | 60          |

  Scenario Outline: No problem detected
    Given the sensor provides a <healthIndex>
    When the machine interprets the index as not multiple of 3 and 5
    Then the screen should display "pas de pathologie"
    Examples:
      | healthIndex |
      | 7           |
      | 22          |
      | 44          |