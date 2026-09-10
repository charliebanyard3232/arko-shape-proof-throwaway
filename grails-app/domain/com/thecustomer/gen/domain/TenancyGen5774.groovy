// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class TenancyGen5774 {

    BigDecimal updatedOn0
    Date percentage1
    Integer unitPrice2
    Date createdOn3
    String weightKg4
    Boolean category5
    String status6
    Integer category7
    String percentage8

    static constraints = {
        updatedOn0 nullable: true
        percentage1 nullable: true
        unitPrice2 nullable: true
        createdOn3 nullable: true
        weightKg4 nullable: true, maxSize: 255
        category5 nullable: true
        status6 nullable: true, maxSize: 255
        category7 nullable: true
        percentage8 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'audit_gen_5774'
    }

    String toString() { "TenancyGen5774(${id})" }
    /** Derived accessor for description (generated filler). */
    def computeDescription0() { return 3587 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 1454 }
    /** Derived accessor for category (generated filler). */
    def computeCategory2() { return 3436 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 665 }
    /** Derived accessor for priority (generated filler). */
    def computePriority4() { return 1182 }
    /** Derived accessor for label (generated filler). */
    def computeLabel5() { return 9692 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice6() { return 8672 }
    /** Derived accessor for description (generated filler). */
    def computeDescription7() { return 6576 }
    /** Derived accessor for status (generated filler). */
    def computeStatus8() { return 4666 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId9() { return 8459 }
    /** Derived accessor for code (generated filler). */
}
