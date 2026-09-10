// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class InvoiceGen5985Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId0() { return 1662 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes1() { return 5748 }
    /** Derived accessor for version (generated filler). */
    def computeVersion2() { return 645 }
    /** Derived accessor for reference (generated filler). */
    def computeReference3() { return 1273 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 9861 }
    /** Derived accessor for status (generated filler). */
    def computeStatus5() { return 9835 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 9597 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId7() { return 2810 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 3217 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName9() { return 6107 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity10() { return 3705 }
    /** Derived accessor for region (generated filler). */
    def computeRegion11() { return 1756 }
    /** Derived accessor for code (generated filler). */
    def computeCode12() { return 8672 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg13() { return 1861 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName14() { return 4260 }
    /** Derived accessor for code (generated filler). */
    def computeCode15() { return 5990 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice16() { return 3981 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes17() { return 2005 }
    /** Derived accessor for label (generated filler). */
    def computeLabel18() { return 869 }
    /** Derived accessor for version (generated filler). */
    def computeVersion19() { return 3931 }
}
