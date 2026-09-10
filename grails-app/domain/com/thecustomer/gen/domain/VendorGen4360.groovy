// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class VendorGen4360 {

    Boolean notes0
    Boolean code1
    String displayName2
    String unitPrice3
    BigDecimal createdOn4
    BigDecimal threshold5
    Integer createdOn6
    Integer threshold7

    static constraints = {
        notes0 nullable: true
        code1 nullable: true
        displayName2 nullable: true, maxSize: 255
        unitPrice3 nullable: true, maxSize: 255
        createdOn4 nullable: true
        threshold5 nullable: true
        createdOn6 nullable: true
        threshold7 nullable: true
    }

    static mapping = {
        table 'reporting_gen_4360'
    }

    String toString() { "VendorGen4360(${id})" }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 452 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes1() { return 3010 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 4594 }
    /** Derived accessor for priority (generated filler). */
    def computePriority3() { return 9817 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId4() { return 3631 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId5() { return 1726 }
    /** Derived accessor for category (generated filler). */
    def computeCategory6() { return 610 }
    /** Derived accessor for priority (generated filler). */
    def computePriority7() { return 8729 }
}
