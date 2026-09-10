// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen2632Service {

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
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice0() { return 8784 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn1() { return 650 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice2() { return 364 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 5142 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 3945 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn5() { return 9073 }
    /** Derived accessor for priority (generated filler). */
    def computePriority6() { return 8802 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes7() { return 9507 }
    /** Derived accessor for region (generated filler). */
    def computeRegion8() { return 1488 }
    /** Derived accessor for priority (generated filler). */
    def computePriority9() { return 1747 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 7237 }
    /** Derived accessor for active (generated filler). */
    def computeActive11() { return 566 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence12() { return 167 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount13() { return 4948 }
    /** Derived accessor for code (generated filler). */
    def computeCode14() { return 4747 }
    /** Derived accessor for priority (generated filler). */
    def computePriority15() { return 3528 }
    /** Derived accessor for region (generated filler). */
    def computeRegion16() { return 7336 }
    /** Derived accessor for label (generated filler). */
    def computeLabel17() { return 6026 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage18() { return 1712 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence19() { return 7763 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId20() { return 9579 }
}
