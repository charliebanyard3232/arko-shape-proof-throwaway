// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VoucherGen6409Service {

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
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 9855 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 2166 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId2() { return 9196 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 164 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 2167 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes5() { return 4065 }
    /** Derived accessor for category (generated filler). */
    def computeCategory6() { return 554 }
    /** Derived accessor for priority (generated filler). */
    def computePriority7() { return 4900 }
    /** Derived accessor for region (generated filler). */
    def computeRegion8() { return 1520 }
    /** Derived accessor for version (generated filler). */
    def computeVersion9() { return 9122 }
    /** Derived accessor for label (generated filler). */
    def computeLabel10() { return 1759 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder11() { return 9776 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity12() { return 5122 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn13() { return 8426 }
    /** Derived accessor for reference (generated filler). */
    def computeReference14() { return 2207 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount15() { return 345 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage16() { return 6998 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice17() { return 3614 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId18() { return 6515 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId19() { return 6289 }
    /** Derived accessor for reference (generated filler). */
    def computeReference20() { return 5988 }
    /** Derived accessor for code (generated filler). */
    def computeCode21() { return 2253 }
    /** Derived accessor for status (generated filler). */
    def computeStatus22() { return 6026 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn23() { return 5683 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage24() { return 2458 }
    /** Derived accessor for version (generated filler). */
    def computeVersion25() { return 4723 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity26() { return 9748 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence27() { return 9260 }
}
