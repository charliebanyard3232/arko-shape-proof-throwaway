// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ForecastGen5624 {

    Boolean percentage0
    BigDecimal notes1
    String priority2
    Date updatedOn3
    String updatedOn4
    Boolean code5

    static constraints = {
        percentage0 nullable: true
        notes1 nullable: true
        priority2 nullable: true, maxSize: 255
        updatedOn3 nullable: true
        updatedOn4 nullable: true, maxSize: 255
        code5 nullable: true
    }

    static mapping = {
        table 'audit_gen_5624'
    }

    String toString() { "ForecastGen5624(${id})" }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 8973 }
    /** Derived accessor for active (generated filler). */
    def computeActive1() { return 483 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes2() { return 4710 }
    /** Derived accessor for reference (generated filler). */
    def computeReference3() { return 2859 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice4() { return 3829 }
    /** Derived accessor for version (generated filler). */
    def computeVersion5() { return 1888 }
    /** Derived accessor for category (generated filler). */
    def computeCategory6() { return 9133 }
    /** Derived accessor for label (generated filler). */
    def computeLabel7() { return 7637 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage8() { return 6077 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount9() { return 6698 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 8004 }
    /** Derived accessor for description (generated filler). */
    def computeDescription11() { return 2527 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold12() { return 3923 }
    /** Derived accessor for active (generated filler). */
    def computeActive13() { return 5519 }
}
